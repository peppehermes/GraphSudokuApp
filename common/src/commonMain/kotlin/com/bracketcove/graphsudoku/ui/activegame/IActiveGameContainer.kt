package com.bracketcove.graphsudoku.ui.activegame

/**
 * A container within which the various parts of an application, or a specific feature of an
 * application, are deployed within.
 */
interface IActiveGameContainer {
    fun showError(message: String)
    fun onNewGameClick()
}