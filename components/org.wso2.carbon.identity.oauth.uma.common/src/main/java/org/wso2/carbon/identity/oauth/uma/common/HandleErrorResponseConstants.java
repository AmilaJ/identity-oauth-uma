/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.oauth.uma.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains the http status codes and error codes to be sent in body of the response as a JSON Result as specified in
 * spec when an error occurs.
 * https://docs.kantarainitiative.org/uma/wg/oauth-uma-federated-authz-2.0-09.html#errors
 */
public final class HandleErrorResponseConstants {

    public static final Map<String, String[]> RESPONSE_DATA_MAP = new HashMap<>();

    static {

        RESPONSE_DATA_MAP.put("60001", new String[]{"404", "not_found"});
        RESPONSE_DATA_MAP.put("60002", new String[]{"400", "invalid_request"});
        RESPONSE_DATA_MAP.put("60003", new String[]{"409", "conflict"});
        RESPONSE_DATA_MAP.put("60004", new String[]{"400", "invalid_resource_id"});
        RESPONSE_DATA_MAP.put("60005", new String[]{"400", "invalid_scope"});
        RESPONSE_DATA_MAP.put("60017", new String[]{"400", "invalid_grant"});
    }

}
