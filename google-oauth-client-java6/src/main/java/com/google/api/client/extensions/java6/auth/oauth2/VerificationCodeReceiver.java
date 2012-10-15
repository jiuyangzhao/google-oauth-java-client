/*
 * Copyright (c) 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.api.client.extensions.java6.auth.oauth2;

import java.io.IOException;

/**
 * OAuth 2.0 verification code receiver.
 *
 * <p>
 * Implementation should be thread-safe.
 * </p>
 *
 * @since 1.11
 * @author Yaniv Inbar
 */
public interface VerificationCodeReceiver {

  /**
   * Returns the redirect URI.
   *
   * <p>
   * Upgrade warning: this method now throws an {@link IOException}. In prior version 1.11 it threw
   * an {@link Exception}.
   * </p>
   */
  String getRedirectUri() throws IOException;

  /**
   * Waits for a verification code.
   *
   * <p>
   * Upgrade warning: this method now throws an {@link IOException}. In prior version 1.11 it threw
   * an {@link Exception}.
   * </p>
   */
  String waitForCode() throws IOException;

  /**
   * Releases any resources and stops any processes started.
   *
   * <p>
   * Upgrade warning: this method now throws an {@link IOException}. In prior version 1.11 it threw
   * an {@link Exception}.
   * </p>
   */
  void stop() throws IOException;
}
