package com.bytee.beyondapps.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/bytee/beyondapps/data/api/ApiEndPoints;", "", "()V", "Companion", "app_debug"})
public abstract class ApiEndPoints {
    @org.jetbrains.annotations.NotNull()
    public static final com.bytee.beyondapps.data.api.ApiEndPoints.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String baseUrl = "pixabay.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String apiKey = "/api/?key=21361571-225988f8d640b5cab646fcbb6";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String randomListEndPoint = "/api/?key=21361571-225988f8d640b5cab646fcbb6&q=mountains&image_type=photo&orientation=vertical&min_height=600";
    
    public ApiEndPoints() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/bytee/beyondapps/data/api/ApiEndPoints$Companion;", "", "()V", "apiKey", "", "baseUrl", "randomListEndPoint", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}