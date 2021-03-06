/*
 * ****************************************************************************
 *    Copyright 2014-2016 Spectra Logic Corporation. All Rights Reserved.
 *    Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *    this file except in compliance with the License. A copy of the License is located at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *    or in the "license" file accompanying this file.
 *    This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *    CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *    specific language governing permissions and limitations under the License.
 *  ****************************************************************************
 */

package com.spectralogic.ds3client.networking;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/**
 * Ds3 abstraction for a WebResponse.  Used to abstract out how the internal networking is implemented.
 */
public interface WebResponse extends Closeable {
    InputStream getResponseStream() throws IOException;
    int getStatusCode();
    Headers getHeaders();
}
