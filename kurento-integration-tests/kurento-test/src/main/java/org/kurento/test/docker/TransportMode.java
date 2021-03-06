/*
 * (C) Copyright 2014 Kurento (http://kurento.org/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.kurento.test.docker;


/**
 * Type of transport protocol
 *
 * @author Raul Benitez (rbenitez@gsyc.es)
 * @since 6.3.1
 */
public enum TransportMode {
  UDP, TCP, BOTH;

  public static TransportMode find(String transportMode) {
    for (TransportMode v : values()) {
      if (v.toString().equals(transportMode)) {
        return v;
      }
    }
    return null;
  }

  @Override
  public String toString() {
    switch (this) {
      case UDP:
        return "UDP";
      case TCP:
        return "TCP";
      case BOTH:
        return "BOTH";
      default:
        throw new IllegalArgumentException();
    }
  }
}
