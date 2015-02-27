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

import javafx.event.Event;
import javafx.scene.control.Tab;

/**
 * The event that occurres if a tab is dragged.
 */
public class TabDraggedEvent extends Event {
	private Tab draggedTab;
	private int fromIndex;
	private int toIndex;
	
	/**
	 * Creates a new instance of {@link TabDraggedEvent}.
	 * 
	 * @param draggedTab the dragged tab.
	 * @param fromIndex the from index.
	 * @param toIndex the to index.
	 */
	public TabDraggedEvent(Tab draggedTab, int fromIndex, int toIndex) {
		super(null);
		
		this.draggedTab = draggedTab;
		this.fromIndex = fromIndex;
		this.toIndex = toIndex;
	}
	
	/**
	 * Gets the dragged tab.
	 * 
	 * @return the dragged tab.
	 */
	public Tab getDraggedTab() {
		return draggedTab;
	}
	
	/**
	 * Gets the from index.
	 * 
	 * @return the from index.
	 */
	public int getFromIndex() {
		return fromIndex;
	}
	
	/**
	 * Gets the to index.
	 * 
	 * @return the to index.
	 */
	public int getToIndex() {
		return toIndex;
	}
}
