package com.luxoft.effectivejava.exercise4;

/**
 * Change class to be immutable.
 */
public class ImmutableUser {
    private final char[] login;

    private final String[] aliases;

    public ImmutableUser(String login, String[] aliases) {
        this.login = login.toCharArray();
        this.aliases = aliases;
    }

    public char[] getLogin() {
        return login;
    }

    public String[] getAliases() {
        return aliases;
    }
}
