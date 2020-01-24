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
package org.envirocar.server.rest.schema;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.envirocar.server.rest.GuiceRunner;
import org.envirocar.server.rest.MediaTypes;
import org.envirocar.server.rest.Schemas;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann <autermann@uni-muenster.de>
 */
@RunWith(GuiceRunner.class)
public class TracksValidationTest {
    private static final String ID_LIST =
            "{\"tracks\":[{\"id\":\"51bf0310e4b0e636c1b40d52\"},{\"id\":\"51bb21aee4b0e636c1b30ee3\"},{\"id\":\"51bb0ec3e4b0e636c1b25e5d\"},{\"id\":\"51bb0c42e4b0e636c1b25ba7\"},{\"id\":\"51b9f81ce4b0900636607b12\"},{\"id\":\"51b4aefce4b055310ecf2d27\"},{\"id\":\"51b37111e4b01748637fc457\"},{\"id\":\"51b3710de4b01748637fbfd4\"},{\"id\":\"51b370d0e4b01748637fbd28\"},{\"id\":\"51b370cae4b01748637fba7c\"},{\"id\":\"51b36fa9e4b01748637f9069\"},{\"id\":\"51b36fa2e4b01748637f8aa2\"},{\"id\":\"51b36ea8e4b01748637f69a5\"},{\"id\":\"51b36e99e4b01748637f6522\"},{\"id\":\"51b36db8e4b01748637f5441\"},{\"id\":\"51b35ceee4b01748637f325a\"},{\"id\":\"51b35bece4b01748637f3257\"},{\"id\":\"51b35bc9e4b01748637f3254\"},{\"id\":\"51b35bc3e4b01748637f3251\"},{\"id\":\"51b34f75e4b01748637f310d\"},{\"id\":\"51b34cf3e4b01748637f2f90\"},{\"id\":\"51b34cd4e4b01748637f2e13\"},{\"id\":\"51b34ccbe4b01748637f2c96\"},{\"id\":\"51b3200ce4b01748637ece27\"},{\"id\":\"51b3200ae4b01748637ecb7b\"},{\"id\":\"51b3115de4b01748637eb674\"},{\"id\":\"51b30b4be4b01748637ead75\"},{\"id\":\"51b2bd74e4b01748637ea9d0\"},{\"id\":\"51b2bd74e4b01748637ea997\"},{\"id\":\"51b24b0ae4b01748637ea507\"},{\"id\":\"51b24b0ae4b01748637ea500\"},{\"id\":\"51b24a8ce4b01748637ea4cc\"},{\"id\":\"51b24a8ce4b01748637ea4c6\"},{\"id\":\"51b24a41e4b01748637ea4a9\"},{\"id\":\"51b249f8e4b01748637ea428\"},{\"id\":\"51b2498ce4b01748637ea3ab\"},{\"id\":\"51b24952e4b01748637ea32d\"},{\"id\":\"51b24952e4b01748637ea327\"},{\"id\":\"51b24884e4b01748637ea242\"},{\"id\":\"51b24884e4b01748637ea239\"},{\"id\":\"51b2481de4b01748637ea0e6\"},{\"id\":\"51b2481de4b01748637ea0dd\"},{\"id\":\"51b24727e4b01748637ea068\"},{\"id\":\"51b22187e4b01748637e9e26\"},{\"id\":\"51b21efbe4b01748637e9ceb\"},{\"id\":\"51b21d4fe4b01748637e9c7c\"},{\"id\":\"51b21d16e4b01748637e9c15\"},{\"id\":\"51b21b55e4b01748637e9baa\"},{\"id\":\"51b21759e4b0c7daaf248e0e\"},{\"id\":\"51b216ede4b0cac5e5bcf437\"},{\"id\":\"51b216e4e4b0ecb3f1f4ecc8\"},{\"id\":\"51b213b7e4b0ecb3f1f4ec68\"},{\"id\":\"51b21308e4b0ecb3f1f4ec63\"},{\"id\":\"51b2127ee4b0ecb3f1f4ec5e\"},{\"id\":\"51b21180e4b0ecb3f1f4ec59\"},{\"id\":\"51b21088e4b0ecb3f1f4ec52\"},{\"id\":\"51b20e73e4b0ecb3f1f4ec4c\"},{\"id\":\"51b072bfe4b043f0df09d0fe\"},{\"id\":\"51b06ddae4b043f0df09c090\"},{\"id\":\"51b067bbe4b043f0df09be0e\"},{\"id\":\"51b06693e4b043f0df09bb95\"},{\"id\":\"51b0664ce4b043f0df09bb4c\"},{\"id\":\"51b05902e4b043f0df09a4ab\"},{\"id\":\"51b058b6e4b043f0df09a47b\"},{\"id\":\"51b0494fe4b043f0df099e6b\"},{\"id\":\"51b0493ce4b043f0df099e65\"},{\"id\":\"51b04899e4b043f0df099b93\"},{\"id\":\"51b0485ce4b043f0df099b59\"},{\"id\":\"51b0485ce4b043f0df099b53\"},{\"id\":\"51b04840e4b043f0df099b35\"},{\"id\":\"51afcd6ce4b04043b6436a8e\"},{\"id\":\"51afcd6ae4b04043b6436a88\"},{\"id\":\"51afcd69e4b04043b6436a82\"},{\"id\":\"51afcd5de4b04043b6436a68\"},{\"id\":\"51afcd33e4b04043b6436a4f\"},{\"id\":\"51afc802e4b04043b64367a0\"},{\"id\":\"51afc597e4b04043b6436786\"},{\"id\":\"51afc542e4b04043b6436770\"},{\"id\":\"51afc4eae4b04043b643676a\"},{\"id\":\"51afbe35e4b04043b6436688\"},{\"id\":\"51afbe33e4b04043b6436682\"},{\"id\":\"51afbe30e4b04043b643667c\"},{\"id\":\"51afbe17e4b04043b6436676\"},{\"id\":\"51afb9c6e4b04043b6436663\"},{\"id\":\"51afb9c3e4b04043b643665d\"},{\"id\":\"51afb9b2e4b04043b6436657\"},{\"id\":\"51afb973e4b04043b6436651\"},{\"id\":\"51afb60de4b04043b64365b1\"},{\"id\":\"51afb371e4b04043b643624d\"},{\"id\":\"51afb354e4b04043b6436240\"},{\"id\":\"51afafc8e4b04043b64361a8\"},{\"id\":\"51afadf9e4b04043b6436080\"},{\"id\":\"51afaa69e4b04043b6435f8e\"},{\"id\":\"51af586be4b014f3e6f060e1\"},{\"id\":\"51af5868e4b014f3e6f060c9\"},{\"id\":\"51af5866e4b014f3e6f060b9\"},{\"id\":\"51af586be4b014f3e6f060e5\"},{\"id\":\"51af5869e4b014f3e6f060d5\"},{\"id\":\"51af5865e4b014f3e6f060b1\"},{\"id\":\"51af5869e4b014f3e6f060d1\"}]}";
    private static final String TRACKS =
            "{\"tracks\":[{\"id\":\"51b2498ce4b01748637ea3ab\",\"modified\":\"2013-06-07T20:58:52Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b24952e4b01748637ea32d\",\"modified\":\"2013-06-07T20:57:54Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b24952e4b01748637ea327\",\"modified\":\"2013-06-07T20:57:54Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b24884e4b01748637ea242\",\"modified\":\"2013-06-07T20:54:28Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b24884e4b01748637ea239\",\"modified\":\"2013-06-07T20:54:28Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b2481de4b01748637ea0e6\",\"modified\":\"2013-06-07T20:52:45Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b2481de4b01748637ea0dd\",\"modified\":\"2013-06-07T20:52:45Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b24727e4b01748637ea068\",\"modified\":\"2013-06-07T20:48:39Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b22187e4b01748637e9e26\",\"modified\":\"2013-06-07T18:08:07Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b21efbe4b01748637e9ceb\",\"modified\":\"2013-06-07T17:57:15Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b21d4fe4b01748637e9c7c\",\"modified\":\"2013-06-07T17:50:07Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b21d16e4b01748637e9c15\",\"modified\":\"2013-06-07T17:49:10Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b21b55e4b01748637e9baa\",\"modified\":\"2013-06-07T17:41:41Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b21759e4b0c7daaf248e0e\",\"modified\":\"2013-06-07T17:24:42Z\",\"name\":\"Test-Track\"},{\"id\":\"51b216ede4b0cac5e5bcf437\",\"modified\":\"2013-06-07T17:22:53Z\",\"name\":\"Test-Track\"},{\"id\":\"51b216e4e4b0ecb3f1f4ecc8\",\"modified\":\"2013-06-07T17:22:44Z\",\"name\":\"Test-Track\"},{\"id\":\"51b213b7e4b0ecb3f1f4ec68\",\"modified\":\"2013-06-07T17:09:11Z\",\"name\":\"Test-Track\"},{\"id\":\"51b21308e4b0ecb3f1f4ec63\",\"modified\":\"2013-06-07T17:06:16Z\",\"name\":\"Test-Track\"},{\"id\":\"51b2127ee4b0ecb3f1f4ec5e\",\"modified\":\"2013-06-07T17:03:58Z\",\"name\":\"Test-Track\"},{\"id\":\"51b21180e4b0ecb3f1f4ec59\",\"modified\":\"2013-06-07T16:59:44Z\",\"name\":\"Test-Track\"},{\"id\":\"51b21088e4b0ecb3f1f4ec52\",\"modified\":\"2013-06-07T16:55:36Z\",\"name\":\"Test-Track\"},{\"id\":\"51b20e73e4b0ecb3f1f4ec4c\",\"modified\":\"2013-06-07T16:46:43Z\",\"name\":\"Test-Track\"},{\"id\":\"51b072bfe4b043f0df09d0fe\",\"modified\":\"2013-06-06T11:30:07Z\"},{\"id\":\"51b06ddae4b043f0df09c090\",\"modified\":\"2013-06-06T11:09:15Z\"},{\"id\":\"51b067bbe4b043f0df09be0e\",\"modified\":\"2013-06-06T10:43:07Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b06693e4b043f0df09bb95\",\"modified\":\"2013-06-06T10:38:11Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b0664ce4b043f0df09bb4c\",\"modified\":\"2013-06-06T10:37:00Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b05902e4b043f0df09a4ab\",\"modified\":\"2013-06-06T09:40:18Z\"},{\"id\":\"51b058b6e4b043f0df09a47b\",\"modified\":\"2013-06-06T09:39:02Z\"},{\"id\":\"51b0494fe4b043f0df099e6b\",\"modified\":\"2013-06-06T08:33:19Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b0493ce4b043f0df099e65\",\"modified\":\"2013-06-06T08:33:00Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b04899e4b043f0df099b93\",\"modified\":\"2013-06-06T08:30:17Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b0485ce4b043f0df099b59\",\"modified\":\"2013-06-06T08:29:16Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b0485ce4b043f0df099b53\",\"modified\":\"2013-06-06T08:29:16Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51b04840e4b043f0df099b35\",\"modified\":\"2013-06-06T08:28:48Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afcd6ce4b04043b6436a8e\",\"modified\":\"2013-06-05T23:44:44Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afcd6ae4b04043b6436a88\",\"modified\":\"2013-06-05T23:44:43Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afcd69e4b04043b6436a82\",\"modified\":\"2013-06-05T23:44:41Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afcd5de4b04043b6436a68\",\"modified\":\"2013-06-05T23:44:29Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afcd33e4b04043b6436a4f\",\"modified\":\"2013-06-05T23:43:47Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afc802e4b04043b64367a0\",\"modified\":\"2013-06-05T23:21:38Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afc597e4b04043b6436786\",\"modified\":\"2013-06-05T23:11:19Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afc542e4b04043b6436770\",\"modified\":\"2013-06-05T23:09:54Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afc4eae4b04043b643676a\",\"modified\":\"2013-06-05T23:08:26Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afbe35e4b04043b6436688\",\"modified\":\"2013-06-05T22:39:49Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afbe33e4b04043b6436682\",\"modified\":\"2013-06-05T22:39:47Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afbe30e4b04043b643667c\",\"modified\":\"2013-06-05T22:39:44Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afbe17e4b04043b6436676\",\"modified\":\"2013-06-05T22:39:19Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afb9c6e4b04043b6436663\",\"modified\":\"2013-06-05T22:20:54Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afb9c3e4b04043b643665d\",\"modified\":\"2013-06-05T22:20:51Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afb9b2e4b04043b6436657\",\"modified\":\"2013-06-05T22:20:34Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afb973e4b04043b6436651\",\"modified\":\"2013-06-05T22:19:31Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afb60de4b04043b64365b1\",\"modified\":\"2013-06-05T22:05:01Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afb371e4b04043b643624d\",\"modified\":\"2013-06-05T21:53:53Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afb354e4b04043b6436240\",\"modified\":\"2013-06-05T21:53:24Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afafc8e4b04043b64361a8\",\"modified\":\"2013-06-05T21:38:16Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afadf9e4b04043b6436080\",\"modified\":\"2013-06-05T21:30:33Z\",\"name\":\"This is the Name of the track\"},{\"id\":\"51afaa69e4b04043b6435f8e\",\"modified\":\"2013-06-05T21:15:21Z\",\"name\":\"This is the Name of the track\"}]}";
    @Rule
    public final ValidationRule validate = new ValidationRule();

    @Test
    public void validateIdList() {
        assertThat(validate.parse(ID_LIST),
                   is(validate.validInstanceOf(Schemas.TRACKS)));
    }

    @Test
    public void validateValidTracks() {
        assertThat(validate.parse(TRACKS),
                   is(validate.validInstanceOf(Schemas.TRACKS)));
    }
}
