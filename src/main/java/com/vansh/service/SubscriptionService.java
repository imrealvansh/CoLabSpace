package com.vansh.service;

import com.vansh.domain.PlanType;
import com.vansh.model.Subscription;
import com.vansh.model.User;

public interface SubscriptionService {
    Subscription createSubscription(User user);
    Subscription getUserSubscription(Long userId) throws Exception;
    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
