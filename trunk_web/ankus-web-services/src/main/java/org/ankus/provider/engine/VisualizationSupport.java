/**
 * This file is part of ankus.
 *
 * ankus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * ankus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with ankus.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.ankus.provider.engine;

import org.ankus.model.rest.HadoopCluster;
import org.ankus.model.rest.Visualization;


/**
 * Visualization Execution Job Support.
 *
 * @author Jaesung Ahn
 */
public interface VisualizationSupport {

    /**
     *    Visualization 워크플로우를 실행한다.
     *
     * @param visualization      Visualization
     * @param hadoopCluster Hadoop Cluster
     * @return Job ID
     */
    String run(Visualization visualization, HadoopCluster hadoopCluster, String username);

}