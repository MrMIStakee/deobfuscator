/*
 * Copyright 2016 Sam Sun <me@samczsun.com>
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.javadeobfuscator.deobfuscator.executor.providers;

import java.util.List;

import com.javadeobfuscator.deobfuscator.executor.MethodExecutor.Context;
import com.javadeobfuscator.deobfuscator.executor.MethodExecutor.StackObject;
import com.javadeobfuscator.deobfuscator.org.objectweb.asm.Type;

public interface Provider {

    public Object invokeMethod(String className, String methodName, String methodDesc, StackObject targetObject, List<StackObject> args, Context context);

    public boolean instanceOf(StackObject target, Type type, Context context);
    
    public boolean checkEquality(StackObject first, StackObject second, Context context);

    public void setField(String className, String fieldName, String fieldDesc, StackObject targetObject, Object value, Context context);

    public Object getField(String className, String fieldName, String fieldDesc, StackObject targetObject, Context context);

    public boolean canInvokeMethod(String className, String methodName, String methodDesc, StackObject targetObject, List<StackObject> args, Context context);

    public boolean canCheckInstanceOf(StackObject target, Type type, Context context);
    
    public boolean canCheckEquality(StackObject first, StackObject second, Context context);

    public boolean canGetField(String className, String fieldName, String fieldDesc, StackObject targetObject, Context context);

    public boolean canSetField(String className, String fieldName, String fieldDesc, StackObject targetObject, Object value, Context context);
}