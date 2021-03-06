/*
 * Copyright (c) 2009-2016, b3log.org & hacpai.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.latke.ioc.context.impl;


import java.lang.annotation.Annotation;
import javax.enterprise.context.SessionScoped;
import org.b3log.latke.ioc.context.AbstractContext;


/**
 * Session context.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.0.2, Jun 10, 2009
 */
public final class SessionContext extends AbstractContext {

    /**
     * Constructs an session context.
     */
    public SessionContext() {
        this(SessionScoped.class);
    }

    /**
     * Constructs an session context with the specified scope type.
     * 
     * @param scopeType the specified scope type
     */
    private SessionContext(final Class<? extends Annotation> scopeType) {
        super(scopeType);
    }
}
