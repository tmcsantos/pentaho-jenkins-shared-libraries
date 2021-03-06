/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
import org.hitachivantara.ci.LogLevel
import org.hitachivantara.ci.PrettyPrinter
import org.hitachivantara.ci.StringUtils
import org.hitachivantara.ci.config.BuildData

import static org.hitachivantara.ci.LogLevel.ERROR
import static org.hitachivantara.ci.LogLevel.WARNING
import static org.hitachivantara.ci.LogLevel.INFO
import static org.hitachivantara.ci.LogLevel.DEBUG

def error(msg, dump = null) {
  message ERROR, msg, dump
}

def warn(msg, dump = null) {
  message WARNING, msg, dump
}

def info(msg, dump = null) {
  message INFO, msg, dump
}

def debug(msg, dump = null) {
  message DEBUG, msg, dump
}

def message(LogLevel level, Object body, Object dump) {
  if (BuildData.instance.logLevel.encompasses(level)) {
    def message = "[${level.label}] " << String.valueOf(body)
    if (dump) {
      message << "\n"
      if (dump instanceof Throwable) {
        StringWriter w = new StringWriter()
        StringUtils.printStackTrace(dump, new PrintWriter(w))
        message.append(w.buffer)
      } else {
        message << new PrettyPrinter(dump).incrementIndent().toPrettyPrint()
      }
    }
    echo message.toString()
  }
}
