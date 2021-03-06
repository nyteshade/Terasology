/*
 * Copyright 2012 Benjamin Glatzel <benjamin.glatzel@me.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.data.blocks.definitions.soil

/**
 * Black sand is sand that is black in color. This sand is a heavy, partly
 * magnetic mixture of usually fine sands, found as part of a placer deposit
 * (a placer deposit is an accumulation of valuable minerals formed by gravity
 * separation during sedimentary processes). This type of black sand is found
 * on beaches near a volcano and consists of tiny fragments of lava.
 */
block {
    version = 1
    shape = "cube"

    hardness = 2

    physics {
        mass = 32000
    }
}