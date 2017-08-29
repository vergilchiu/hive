/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.ql.optimizer.calcite.rules.views;

import org.apache.calcite.rel.rules.AbstractMaterializedViewRule.MaterializedViewOnlyFilterRule;
import org.apache.calcite.rel.rules.AbstractMaterializedViewRule.MaterializedViewProjectFilterRule;
import org.apache.hadoop.hive.ql.optimizer.calcite.HiveRelFactories;

/**
 * Planner rule that replaces (if possible) a {@link org.apache.calcite.rel.core.Project}
 * on a {@link org.apache.calcite.rel.core.Filter} and {@link org.apache.calcite.rel.core.Filter}
 * or a {@link org.apache.calcite.rel.core.Filter} on a {@link org.apache.calcite.rel.core.TableScan}
 * to use a Materialized View.
 */
public class HiveMaterializedViewRule {

  public static final MaterializedViewProjectFilterRule INSTANCE_PROJECT_FILTER =
      new MaterializedViewProjectFilterRule(HiveRelFactories.HIVE_BUILDER, false);

  public static final MaterializedViewOnlyFilterRule INSTANCE_FILTER =
      new MaterializedViewOnlyFilterRule(HiveRelFactories.HIVE_BUILDER, false);

}
