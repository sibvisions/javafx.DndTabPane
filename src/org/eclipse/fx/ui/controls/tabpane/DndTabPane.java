/*******************************************************************************
 * Copyright (c) 2015 SIB Visions and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Zenz<robert.zenz@sibvisions.com> - creation
 *******************************************************************************/
package org.eclipse.fx.ui.controls.tabpane;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.scene.control.TabPane;

/**
 * A simple extension of the {@link TabPane} that allows to disable dragging.
 */
public class DndTabPane extends TabPane {
	private BooleanProperty draggingEnabled = new SimpleBooleanProperty(true);
	
	/**
	 * Creates a new instance of {@link DndTabPane}.
	 */
	public DndTabPane() {
		super();
	}
	
	/**
	 * The property for enabling and disabling the dragging support.
	 * 
	 * @return the property.
	 */
	public BooleanProperty draggingEnabledProperty() {
		return draggingEnabled;
	}
	
	/**
	 * Gets if the dragging of tabs is enabled.
	 * 
	 * @return {@code true} if the dragging of tabs is enabled.
	 */
	public boolean isDraggingEnabled() {
		return draggingEnabled.get();
	}
	
	/**
	 * Sets if the dragging of tabs is enabled.
	 * 
	 * @param enabled {@code true} if the dragging of tabs should be enabled.
	 */
	public void setDraggingEnabled(boolean enabled) {
		draggingEnabled.set(enabled);
	}
}
