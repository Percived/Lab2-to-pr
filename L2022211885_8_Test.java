import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2022211885_8_Test {

    private final Solution8 solution = new Solution8();

    /**
     * 测试目的：验证没有岛屿的情况
     * 测试用例：全部为水的网格
     */
    @Test
    public void testNoIsland() {
        char[][] grid = {
            {'0', '0', '0'},
            {'0', '0', '0'}
        };
        assertEquals(0, solution.numIslands(grid));
    }

    /**
     * 测试目的：验证单一岛屿的情况
     * 测试用例：包含一个岛屿的网格
     */
    @Test
    public void testSingleIsland() {
        char[][] grid = {
            {'1', '1', '0'},
            {'0', '1', '0'}
        };
        assertEquals(1, solution.numIslands(grid));
    }

    /**
     * 测试目的：验证多个分离岛屿的情况
     * 测试用例：包含两个或更多不相连岛屿的网格
     */
    @Test
    public void testMultipleIslands() {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(grid));
    }

    /**
     * 测试目的：验证相邻岛屿合并成一个大岛屿的情况
     * 测试用例：包含多个岛屿，但它们实际上通过某些连接形成了一个大的岛屿
     */
    @Test
    public void testConnectedIslands() {
        char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, solution.numIslands(grid));
    }

    /**
     * 测试目的：验证边界情况
     * 测试用例：空数组和单元素数组
     */
    @Test
    public void testEdgeCases() {
        char[][] emptyGrid = {};
        assertEquals(0, solution.numIslands(emptyGrid));

        char[][] singleElementGrid = {{'1'}};
        assertEquals(1, solution.numIslands(singleElementGrid));
    }

    /**
     * 测试目的：验证对 null 输入的处理
     * 测试用例：传入 null
     */
    @Test
    public void testNullInput() {
        char[][] nullGrid = null;
        assertEquals(0, solution.numIslands(nullGrid));
    }
}