package com.cache.demo.services;

import java.util.Map;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.cache.demo.entity.User;
import com.cache.demo.repos.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	private final CacheManager cacheManager;

	public UserService(UserRepository userRepository, CacheManager cacheManager) {
		this.userRepository = userRepository;
		this.cacheManager = cacheManager;
	}

	@Cacheable(value = "users", key = "#id")
	public User getUserById(Long id) {
		// Log the entire cache content
		logCacheContent();

		System.out.println("Fetching user from database...");
		return userRepository.findById(id).orElse(null); // Using orElse to handle empty cases
	}

	@CachePut(value = "users", key = "#user.id")
	public User saveUser(User user) {
		System.out.println("Saving user to database and updating cache...");
		return userRepository.save(user);
	}

	private void logCacheContent() {
		Cache cache = cacheManager.getCache("users");
		if (cache != null) {
			System.out.println("Cache content for 'users' cache:");

			// Check if the nativeCache is a Map
			Object nativeCache = cache.getNativeCache();
			if (nativeCache instanceof Map) {
				Map<?, ?> mapCache = (Map<?, ?>) nativeCache;
				mapCache.forEach((key, value) -> {
					System.out.println("Key: " + key + ", Value: " + value);
				});
			} else {
				System.out.println("Native cache is not a Map, unable to display cache contents.");
			}
		}
	}

	public Map<?, ?> getAllCacheData() {
		Cache cache = cacheManager.getCache("users");
		if (cache != null) {
			Object nativeCache = cache.getNativeCache();
			if (nativeCache instanceof Map) {
				return (Map<?, ?>) nativeCache;
			}
		}
		return null;
	}
}
