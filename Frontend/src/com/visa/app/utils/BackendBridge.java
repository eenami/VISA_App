package com.visa.app.utils;

import com.visa.app.DatabaseManager;
import java.util.Collections;
import java.util.List;

public class BackendBridge {
    private static BackendBridge instance;
    private final DatabaseManager db;

    private BackendBridge() {
        this.db = DatabaseManager.getInstance();
    }

    public static synchronized BackendBridge getInstance() {
        if (instance == null) {
            instance = new BackendBridge();
        }
        return instance;
    }

    public List<String> getApplicantsWithPassportDetails() {
        // Placeholder implementation; the caller does not use the result.
        return Collections.emptyList();
    }

    public List<String> getApplicationsWithDocumentCount() {
        // Placeholder implementation; the caller does not use the result.
        return Collections.emptyList();
    }

    public boolean approveApplication(int appId) {
        return db.updateApplicationStatus(appId, "APPROVED");
    }

    public boolean denyApplication(int appId) {
        return db.updateApplicationStatus(appId, "DENIED");
    }
}
