package no.uib.inf101.tetris;

import javax.swing.JFrame;

import no.uib.inf101.tetris.controller.TetrisController;


import no.uib.inf101.tetris.model.TetrisBoard;
import no.uib.inf101.tetris.model.TetrisModel;
import no.uib.inf101.tetris.model.tetromino.RandomTetrominoFactory;
import no.uib.inf101.tetris.model.tetromino.TetrominoFactory;
import no.uib.inf101.tetris.view.TetrisView;


public class TetrisMain {
  public static final String WINDOW_TITLE = "INF101 Tetris";

  public static void main(String[] args) {

    TetrisBoard tetrisBoard = new TetrisBoard(20, 10);
    TetrominoFactory tetrominoFactory = new RandomTetrominoFactory();
    TetrisModel tetrisModel = new TetrisModel(tetrisBoard, tetrominoFactory);
    TetrisView view = new TetrisView(tetrisModel);
    TetrisController controller = new TetrisController(tetrisModel, view);

    // The JFrame is the "root" application window.
    // We here set som properties of the main window,
    // and tell it to display our tetrisView
    JFrame frame = new JFrame(WINDOW_TITLE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Here we set which component to view in our window
    frame.setContentPane(view);

    // Call these methods to actually display the window
    frame.pack();
    frame.setVisible(true);

  }

}
