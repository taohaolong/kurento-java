/*
 * (C) Copyright 2014 Kurento (http://kurento.org/)
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser General Public License
 * (LGPL) version 2.1 which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-2.1.html
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
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