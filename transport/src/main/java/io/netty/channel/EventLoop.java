/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel;

import io.netty.util.concurrent.EventExecutor;

/**
 * Will handle all the I/O-Operations for a {@link Channel} once it was registered.
 * 一个Channel一旦被注册上来，其上所有的I/O操作都会被该EventLoop所处理
 *
 * One {@link EventLoop} instance will usually handle more then one {@link Channel} but this may depend on
 * implementation details and internals.
 * 一个EventLoop的实例一般至少会处理一个Channel，但是还是依赖子类的具体实现
 *
 */
public interface EventLoop extends EventExecutor, EventLoopGroup {
    @Override
    EventLoopGroup parent();
}
