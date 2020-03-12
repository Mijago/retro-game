package com.github.retro_game.retro_game.service.impl;

import com.github.retro_game.retro_game.dto.ProductionDto;
import com.github.retro_game.retro_game.entity.Body;
import com.github.retro_game.retro_game.entity.BuildingKind;
import com.github.retro_game.retro_game.entity.Coordinates;
import com.github.retro_game.retro_game.entity.User;
import com.github.retro_game.retro_game.service.BodyService;

import java.util.Date;
import java.util.Map;

interface BodyServiceInternal extends BodyService {
  Body createColony(User user, Coordinates coordinates, Date at);

  Body createMoon(User user, Coordinates coordinates, Date at, double chance);

  // Returns body with updated resources.
  Body getUpdated(long bodyId);

  int getUsedFields(Body body);

  int getMaxFields(Body body);

  int getMaxFields(Body body, Map<BuildingKind, Integer> buildings);

  void updateResources(Body body, Date at);

  ProductionDto getProduction(Body body);

  void destroyMoon(Body moon);
}
