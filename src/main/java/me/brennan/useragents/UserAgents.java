package me.brennan.useragents;

import java.security.SecureRandom;
import java.util.Random;

import static me.brennan.useragents.Agents.USER_AGENTS;

/**
 * @author Brennan
 * @since 2/21/2021
 **/
public class UserAgents {
    private final static Random RANDOM = new SecureRandom();

    public static String randomUserAgent() {
        return USER_AGENTS[RANDOM.nextInt(USER_AGENTS.length)];
    }

}
