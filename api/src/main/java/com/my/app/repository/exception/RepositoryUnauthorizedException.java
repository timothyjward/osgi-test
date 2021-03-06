package com.my.app.repository.exception;

public class RepositoryUnauthorizedException extends Exception
{
    public RepositoryUnauthorizedException() {
    }

    public RepositoryUnauthorizedException(String message) {
        super(message);
    }

    public RepositoryUnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public RepositoryUnauthorizedException(Throwable cause) {
        super(cause);
    }
}
