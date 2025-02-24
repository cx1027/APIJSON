/*Copyright ©2016 TommyLemon(https://github.com/TommyLemon/APIJSON)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package zuo.biao.apijson.server.model;

import zuo.biao.apijson.MethodAccess;

/**扩展属性，SQL Server 转用
 * @author Lemon
 */
@MethodAccess(POST = {}, PUT = {}, DELETE = {})
public class ExtendedProperty {
	public static final String TAG = "ExtendedProperty";
	public static final String TABLE_NAME = "extended_properties";

}
