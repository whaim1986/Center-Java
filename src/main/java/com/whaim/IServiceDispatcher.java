package com.whaim;

/**
 * Created by whaim on 2017/6/27.
 *
 * Process message when received MQ message
 */
public interface IServiceDispatcher {

    boolean dispatch(byte[] msg);
}