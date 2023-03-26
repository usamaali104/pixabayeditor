package com.bytee.beyondapps.data.utils;

import java.lang.System;

/**
 * Immutable data class that allows for loading, data, and exception to be managed independently.
 *
 * This is useful for screens that want to show the last successful result while loading or a later
 * refresh has caused an error.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\bJ\t\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012\u00a8\u0006!"}, d2 = {"Lcom/bytee/beyondapps/data/utils/UiState;", "T", "", "loading", "", "exception", "Lcom/bytee/beyondapps/data/utils/PBThrowable;", "data", "(ZLcom/bytee/beyondapps/data/utils/PBThrowable;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getException", "()Lcom/bytee/beyondapps/data/utils/PBThrowable;", "hasError", "getHasError", "()Z", "initialLoad", "getInitialLoad", "getLoading", "component1", "component2", "component3", "copy", "(ZLcom/bytee/beyondapps/data/utils/PBThrowable;Ljava/lang/Object;)Lcom/bytee/beyondapps/data/utils/UiState;", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class UiState<T extends java.lang.Object> {
    private final boolean loading = false;
    @org.jetbrains.annotations.Nullable()
    private final com.bytee.beyondapps.data.utils.PBThrowable exception = null;
    @org.jetbrains.annotations.Nullable()
    private T data;
    
    /**
     * Immutable data class that allows for loading, data, and exception to be managed independently.
     *
     * This is useful for screens that want to show the last successful result while loading or a later
     * refresh has caused an error.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.bytee.beyondapps.data.utils.UiState<T> copy(boolean loading, @org.jetbrains.annotations.Nullable()
    com.bytee.beyondapps.data.utils.PBThrowable exception, @org.jetbrains.annotations.Nullable()
    T data) {
        return null;
    }
    
    /**
     * Immutable data class that allows for loading, data, and exception to be managed independently.
     *
     * This is useful for screens that want to show the last successful result while loading or a later
     * refresh has caused an error.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    /**
     * Immutable data class that allows for loading, data, and exception to be managed independently.
     *
     * This is useful for screens that want to show the last successful result while loading or a later
     * refresh has caused an error.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Immutable data class that allows for loading, data, and exception to be managed independently.
     *
     * This is useful for screens that want to show the last successful result while loading or a later
     * refresh has caused an error.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UiState() {
        super();
    }
    
    public UiState(boolean loading, @org.jetbrains.annotations.Nullable()
    com.bytee.beyondapps.data.utils.PBThrowable exception, @org.jetbrains.annotations.Nullable()
    T data) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean getLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bytee.beyondapps.data.utils.PBThrowable component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.bytee.beyondapps.data.utils.PBThrowable getException() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    public final boolean getHasError() {
        return false;
    }
    
    public final boolean getInitialLoad() {
        return false;
    }
}