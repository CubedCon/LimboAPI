/*
 * Copyright (C) 2021 - 2023 Elytrium
 *
 * The LimboAPI (excluding the LimboAPI plugin) is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package net.elytrium.limboapi.api.chunk;

import com.velocitypowered.api.network.ProtocolVersion;
import net.elytrium.limboapi.api.material.WorldVersion;

public interface VirtualBlock {

  short getModernID();

  @Deprecated
  short getID(ProtocolVersion version);

  short getBlockID(WorldVersion version);

  short getBlockID(ProtocolVersion version);

  short getBlockStateID(ProtocolVersion version);

  boolean isSolid();

  boolean isAir();

  boolean isMotionBlocking();
}
