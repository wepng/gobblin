/*
 * Copyright (C) 2014-2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied.
 */

package gobblin.converter;

/**
 * A type of {@link Exception} thrown when there's anything wrong
 * with schema conversion.
 *
 * @author Yinan Li
 */
public class SchemaConversionException extends Exception {

  public SchemaConversionException(Throwable cause) {
    super(cause);
  }

  public SchemaConversionException(String message, Throwable cause) {
    super(message, cause);
  }

  public SchemaConversionException(String message) {
    super(message);
  }
}
