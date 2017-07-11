/*
 * MIT License
 *
 * Copyright (c) 2017 Connor Hartley
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.ichorpowered.guardian.api.detection;

import com.ichorpowered.guardian.api.Guardian;

import javax.annotation.Nonnull;

/**
 * Represents a series of operations and
 * conditions to determine if the actions
 * of a player may be illegal, inappropriate
 * or otherwise harmful to the server.
 *
 * @param <E> the check owner type
 * @param <F> the check owner configuration type
 */
public interface Check<E extends Guardian, F> {

    /**
     * Returns the plugin that owns the detection
     * that created this check.
     *
     * @return the detection owner
     */
    @Nonnull
    E getOwner();

    /**
     * Returns the {@link Detection} that owns this check.
     *
     * @return the check owner
     */
    @Nonnull
    Detection<E, F> getDetection();

}
