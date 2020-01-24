/*
 * Copyright (C) 2013-2020 The enviroCar project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.envirocar.server.rest.encoding.rdf;

import java.util.Set;

import javax.inject.Singleton;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.ext.Provider;

import org.envirocar.server.core.entities.Track;
import org.envirocar.server.core.entities.Tracks;

import com.google.inject.Inject;
import org.envirocar.server.rest.resources.RootResource;
import org.envirocar.server.rest.resources.TracksResource;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann <autermann@uni-muenster.de>
 */
@Provider
@Singleton
public class TracksRDFEncoder extends AbstractCollectionRDFEntityEncoder<Track, Tracks> {
    @Inject
    public TracksRDFEncoder(Set<RDFLinker<Track>> linkers) {
        super(Tracks.class, linkers);
    }

    @Override
    protected String getURI(Track t,
                            com.google.inject.Provider<UriBuilder> uri) {
        return uri.get()
                .path(RootResource.class)
                .path(RootResource.TRACKS)
                .path(TracksResource.TRACK)
                .build(t.getIdentifier())
                .toASCIIString();
    }
}
