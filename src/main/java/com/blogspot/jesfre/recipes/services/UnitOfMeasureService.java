package com.blogspot.jesfre.recipes.services;


import com.blogspot.jesfre.recipes.commands.UnitOfMeasureCommand;

import java.util.Set;


public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
