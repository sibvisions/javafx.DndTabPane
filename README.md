# javafx.DndTabPane

This repository holds a Drag'n'Drop extended TabPane which is an extension
of the default JavaFX TabPane.

This TabPane was written by Tom Schindl at [BestSolution](http://bestsolution.at)
and is part of the "org.eclipse.fx.ui.controls" bundle which itself is part of
the [SWT on JavaFX](https://wiki.eclipse.org/Efxclipse/SWTonFX) efforts.

It has been extracted for easier reusability in the [JVx JavaFX](https://sourceforge.net/projects/jvxfx/)
project.

[RT-19659](https://javafx-jira.kenai.com/browse/RT-19659) is the request which
is concerned with getting such a functionality into the default JavaFX TabPane.
It is at the moment slated for version 9.


# License

Source code in this repository is licensed under the Eclipse Public License 1.0.


# Usage example

The DndTabPane needs to be wrapped in an additional container pane, and can
be created via the factory:

    Pane containerPane = DndTabPaneFactory.createDefaultDnDPane(FeedbackType.MARKER, null);
	DndTabPane tabPane = (DndTabPane) containerPane.getChildren().get(0);

There is also a more fine-grained method available:

    // Create the necessary panes.
    DndTabPane tabPane = new DndTabPane();
    StackPane containerPane = new StackPane(tabPane);
	
	// We need to create the skin manually, could also be your custom skin.
    DnDTabPaneSkin skin = new DnDTabPaneSkin(tabPane);
	
	// Setup the dragging.
    DndTabPaneFactory.setup(FeedbackType.MARKER, containerPane, skin);
	
	// Set the skin.
    tabPane.setSkin(skin);
