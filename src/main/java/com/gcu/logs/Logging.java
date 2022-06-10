package com.gcu.logs;

import com.gcu.controllers.HomeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

import java.sql.Timestamp;

public class Logging {

//    static Timestamp tStamp = new Timestamp(System.currentTimeMillis());
//
//    public static void getCurrentClassAndMethodName() {
//        logger.error("***     Class and Method Name = " + Thread.currentThread().getStackTrace()[2].getClassName()
//                                                        + "."
//                                                        + Thread.currentThread().getStackTrace()[2].getMethodName());
//    }
//
//    public static void getTimeStamp() {
//
//        logger.error("***     Timestamp = " + tStamp);
//    }
//
//    static Logger logger = new Logger() {
//
//        @Override
//        public String getName() {
//            return null;
//        }
//
//        @Override
//        public boolean isTraceEnabled() {
//            return false;
//        }
//
//        @Override
//        public void trace(String msg) {
//
//        }
//
//        @Override
//        public void trace(String format, Object arg) {
//
//        }
//
//        @Override
//        public void trace(String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void trace(String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void trace(String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isTraceEnabled(Marker marker) {
//            return false;
//        }
//
//        @Override
//        public void trace(Marker marker, String msg) {
//
//        }
//
//        @Override
//        public void trace(Marker marker, String format, Object arg) {
//
//        }
//
//        @Override
//        public void trace(Marker marker, String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void trace(Marker marker, String format, Object... argArray) {
//
//        }
//
//        @Override
//        public void trace(Marker marker, String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isDebugEnabled() {
//            return false;
//        }
//
//        @Override
//        public void debug(String msg) {
//
//        }
//
//        @Override
//        public void debug(String format, Object arg) {
//
//        }
//
//        @Override
//        public void debug(String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void debug(String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void debug(String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isDebugEnabled(Marker marker) {
//            return false;
//        }
//
//        @Override
//        public void debug(Marker marker, String msg) {
//
//        }
//
//        @Override
//        public void debug(Marker marker, String format, Object arg) {
//
//        }
//
//        @Override
//        public void debug(Marker marker, String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void debug(Marker marker, String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void debug(Marker marker, String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isInfoEnabled() {
//            return false;
//        }
//
//        @Override
//        public void info(String msg) {
//
//        }
//
//        @Override
//        public void info(String format, Object arg) {
//
//        }
//
//        @Override
//        public void info(String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void info(String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void info(String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isInfoEnabled(Marker marker) {
//            return false;
//        }
//
//        @Override
//        public void info(Marker marker, String msg) {
//
//        }
//
//        @Override
//        public void info(Marker marker, String format, Object arg) {
//
//        }
//
//        @Override
//        public void info(Marker marker, String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void info(Marker marker, String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void info(Marker marker, String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isWarnEnabled() {
//            return false;
//        }
//
//        @Override
//        public void warn(String msg) {
//
//        }
//
//        @Override
//        public void warn(String format, Object arg) {
//
//        }
//
//        @Override
//        public void warn(String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void warn(String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void warn(String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isWarnEnabled(Marker marker) {
//            return false;
//        }
//
//        @Override
//        public void warn(Marker marker, String msg) {
//
//        }
//
//        @Override
//        public void warn(Marker marker, String format, Object arg) {
//
//        }
//
//        @Override
//        public void warn(Marker marker, String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void warn(Marker marker, String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void warn(Marker marker, String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isErrorEnabled() {
//            return false;
//        }
//
//        @Override
//        public void error(String msg) {
//            System.out.println(msg);
//        }
//
//        @Override
//        public void error(String format, Object arg) {
//
//        }
//
//        @Override
//        public void error(String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void error(String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void error(String msg, Throwable t) {
//
//        }
//
//        @Override
//        public boolean isErrorEnabled(Marker marker) {
//            return false;
//        }
//
//        @Override
//        public void error(Marker marker, String msg) {
//
//        }
//
//        @Override
//        public void error(Marker marker, String format, Object arg) {
//
//        }
//
//        @Override
//        public void error(Marker marker, String format, Object arg1, Object arg2) {
//
//        }
//
//        @Override
//        public void error(Marker marker, String format, Object... arguments) {
//
//        }
//
//        @Override
//        public void error(Marker marker, String msg, Throwable t) {
//
//        }
//    };
}



