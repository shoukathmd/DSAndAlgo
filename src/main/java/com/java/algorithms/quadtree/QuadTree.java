package com.java.algorithms.quadtree;

import java.util.ArrayList;
import java.util.List;

public class QuadTree {
    final int MAX_CAPACITY = 4;
    int level = 0;
    List<Node> nodes;
    QuadTree northWest = null;
    QuadTree northEast = null;
    QuadTree southWest = null;
    QuadTree southEast = null;
    Boundry boundry;
    QuadTree(int level, Boundry boundry) {
        this.level = level;
        this.boundry = boundry;
        nodes = new ArrayList<>();
    }

    static void dfs(QuadTree tree) {
        if (tree == null) {
            return;
        }

        System.out.printf("\nLevel = %d [X1=%d Y1=%d] \t[X2=%d Y2=%d] ", tree.level, tree.boundry.getxMin(),
                tree.boundry.getyMin(), tree.boundry.getxMax(), tree.boundry.getyMax());

        for (Node node : tree.nodes) {
            System.out.printf("\n\t x=%d, y=%d", node.x, node.y);
        }
        if (tree.nodes.size() == 0) {
            System.out.printf("\n\t Leaf Node")
        }
        dfs(tree.northWest);
        dfs(tree.northEast);
        dfs(tree.southWest);
        dfs(tree.southEast);
    }

    void split() {
        int xOffSet = this.boundry.getxMin() + (this.boundry.getxMax() - this.boundry.getxMin())/2;
        int yOffSet = this.boundry.getyMin() + (this.boundry.getyMax() - this.boundry.getyMin()/2);

        northWest = new QuadTree(this.level + 1, new Boundry(this.boundry.getxMin(), this.boundry.getyMin(),
                xOffSet, yOffSet));
        northEast = new QuadTree(this.level + 1, new Boundry(xOffSet, this.boundry.getyMin(),
                xOffSet, yOffSet));

        southWest = new QuadTree(this.level + 1, new Boundry(this.boundry.getxMin(), xOffSet, yOffSet,
                this.boundry.getyMax()));
        southEast = new QuadTree(this.level + 1, new Boundry(xOffSet, yOffSet, this.boundry.getxMax(), this.boundry.getyMax()));



    }
}
