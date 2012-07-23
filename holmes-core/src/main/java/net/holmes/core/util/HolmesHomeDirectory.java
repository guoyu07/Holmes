package net.holmes.core.util;

import java.io.File;

public class HolmesHomeDirectory {
    private static final String HOME_CONF_FOLDER = "conf";
    private static final String HOME_SITE_FOLDER = "site";
    private static final String HOME_LOG_FOLDER = "log";

    public static String getConfigDirectory() {
        return getSubDirectory(HOME_CONF_FOLDER);
    }

    public static String getSiteDirectory() {
        return getSubDirectory(HOME_SITE_FOLDER);
    }

    public static String getLogDirectory() {
        return getSubDirectory(HOME_LOG_FOLDER);
    }

    private static String getSubDirectory(String subDirName) {
        String homeSubDirectory = System.getProperty(SystemProperty.HOLMES_HOME.getValue()) + File.separator + subDirName;
        File confDir = new File(homeSubDirectory);
        if (!confDir.exists()) {
            confDir.mkdir();
        }
        return homeSubDirectory;
    }
}
