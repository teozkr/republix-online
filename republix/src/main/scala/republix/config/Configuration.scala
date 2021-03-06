/*
 * Copyright © 2014 Teo Klestrup, Carl Dybdahl
 *
 * This file is part of Republix.
 *
 * Republix is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Republix is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Republix.  If not, see <http://www.gnu.org/licenses/>.
 */

package republix.config

import java.nio.file.Path
import republix.util.file.CommonPaths

case class Configuration(lastUse: LastUseConfig = LastUseConfig())

case class LastUseConfig(server: String = "", port: String = "", party: String = "")

object Configuration extends ConfigurationStore[Configuration] {
  override val path: Path = CommonPaths.configFile
  override val empty: Configuration = Configuration()
}
