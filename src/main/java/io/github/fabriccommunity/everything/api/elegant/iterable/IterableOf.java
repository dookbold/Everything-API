/*
 *     Copyright (C) 2020 Fabric Community
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.github.fabriccommunity.everything.api.elegant.iterable;

import java.util.stream.Stream;

public final class IterableOf<A> extends IterableEnvelope<A> {
    @SafeVarargs
    public IterableOf(final A... as) {
        this(Stream.of(as));
    }

    public IterableOf(final Stream<A> as) {
        this(as::iterator);
    }

    private IterableOf(final Iterable<A> iterable) {
        super(iterable);
    }
}
