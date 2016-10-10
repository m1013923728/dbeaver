/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
 * Copyright (C) 2010-2016 Serge Rieder (serge@jkiss.org)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License (version 2)
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.jkiss.dbeaver.ext.exasol;

import org.jkiss.dbeaver.model.DBConstants;
import org.jkiss.dbeaver.model.data.DBDPseudoAttribute;
import org.jkiss.dbeaver.model.data.DBDPseudoAttributeType;

/**
 * Exasol constants
 *
 * @author Karl Griesser
 */
public class ExasolConstants {

    // Display Categories
    public static final String CAT_AUTH = "Authorities";
    public static final String CAT_BASEOBJECT = "Base Object";
    public static final String CAT_DATETIME = "Date & Time";
    public static final String CAT_OWNER = "Owner";
    public static final String CAT_SOURCE = "Source";
    public static final String CAT_PERFORMANCE = "Performance";
    public static final String CAT_STATS = "Statistics";
    public static final String DRV_CLIENT_NAME = "clientname";
    public static final String DRV_CLIENT_VERSION = "clientversion";
    public static final String DRV_QUERYTIMEOUT = "querytimeout";
    public static final String DRV_CONNECT_TIMEOUT = "connecttimeout";
    public static final String DRV_ENCRYPT = DBConstants.INTERNAL_PROP_PREFIX + "encrypt";
    public static final String DRV_BACKUP_HOST_LIST = DBConstants.INTERNAL_PROP_PREFIX + "backupHostList";
    public static final String DRV_USE_BACKUP_HOST_LIST = DBConstants.INTERNAL_PROP_PREFIX + "useBackupHostList";


    public static final DBDPseudoAttribute PSEUDO_ATTR_RID_BIT = new DBDPseudoAttribute(DBDPseudoAttributeType.ROWID,
        "ROWID", "ROWID", "row_id", "Unique physical row identifier", true);

}
