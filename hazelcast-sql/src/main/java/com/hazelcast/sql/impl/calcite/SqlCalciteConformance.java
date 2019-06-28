/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.sql.impl.calcite;

import org.apache.calcite.sql.validate.SqlConformanceEnum;
import org.apache.calcite.sql.validate.SqlDelegatingConformance;

/**
 * Conformance level.
 */
public class SqlCalciteConformance extends SqlDelegatingConformance {
    /** Singleton. */
    public static SqlCalciteConformance INSTANCE = new SqlCalciteConformance();

    private SqlCalciteConformance() {
        super(SqlConformanceEnum.DEFAULT);
    }

    @Override
    public boolean allowExplicitRowValueConstructor() {
        // Do not allow explicit row constructor: "ROW([vals])".
        return false;
    }

    @Override
    public boolean isLimitStartCountAllowed() {
        // Allow "LIMIT [start], [count]" syntax.
        return true;
    }

    @Override
    public boolean isGroupByAlias() {
        // Allow aliases in GROUP BY: "SELECT a AS b FROM table GROUP BY b".
        return true;
    }

    @Override
    public boolean isGroupByOrdinal() {
        // Allow ordinals in GROUP BY: "SELECT a AS b FROM table GROUP BY 1".
        return true;
    }

    @Override
    public boolean isHavingAlias() {
        // Allow aliases in HAVING, similar to example in "isGroupByAlias".
        return true;
    }

    @Override
    public boolean isFromRequired() {
        // TODO: This might be useful when joining with some function provided data. Create a ticket.
        return super.isFromRequired();
    }

    @Override
    public boolean isMinusAllowed() {
        // Support "MINUS" in addition to "EXCEPT".
        return true;
    }
}
