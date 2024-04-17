package tile;

import Main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TileManager {

    GamePanel gp;

    public int scale = 1;
    public Map<Character, Tile> tile;
    public char[][] mapTileVal;

    public final String map = "/maps/map02.txt";

    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new HashMap<>();
        mapTileVal = new char[gp.maxWorldCol][gp.maxWorldRow];
        getTileImage();
        loadMap(map);
    }

    public BufferedImage getImage(String name) throws IOException { return ImageIO.read(getClass().getResourceAsStream(name));}
    private void getTileImage() {
        try {
            tile.put('.' , new Tile());
            tile.get('.').image = getImage("/tiles/blank.png");

            tile.put(',' , new Tile());
            tile.get(',').image = getImage("/tiles/swampTiles/Tile_12.png");
            tile.get(',').collision = true;

            tile.put('0' , new Tile());
            tile.get('0').image = getImage("/tiles/swampTiles/Tile_01.png");
            tile.get('0').collision = true;

            tile.put('1' , new Tile());
            tile.get('1').image = getImage("/tiles/swampTiles/Tile_02.png");
            tile.get('1').collision = true;

            tile.put('2' , new Tile());
            tile.get('2').image = getImage("/tiles/swampTiles/Tile_03.png");
            tile.get('2').collision = true;

            tile.put('3' , new Tile());
            tile.get('3').image = getImage("/tiles/swampTiles/Tile_11.png");
            tile.get('3').collision = true;

            tile.put('4' , new Tile());
            tile.get('4').image = getImage("/tiles/swampTiles/Tile_13.png");
            tile.get('4').collision = true;

            tile.put('5' , new Tile());
            tile.get('5').image = getImage("/tiles/swampTiles/Tile_21.png");
            tile.get('5').collision = true;

            tile.put('6' , new Tile());
            tile.get('6').image = getImage("/tiles/swampTiles/Tile_22.png");
            tile.get('6').collision = true;

            tile.put('7' , new Tile());
            tile.get('7').image = getImage("/tiles/swampTiles/Tile_23.png");
            tile.get('7').collision = true;

            tile.put('8' , new Tile());
            tile.get('8').image = getImage("/tiles/swampTiles/Tile_24.png");
            tile.get('8').collision = true;

            tile.put('9' , new Tile());
            tile.get('9').image = getImage("/tiles/swampTiles/Tile_26.png");
            tile.get('9').collision = true;

            tile.put('a' , new Tile());
            tile.get('a').image = getImage("/tiles/swampTiles/Tile_04.png");
            tile.get('a').collision = true;

            tile.put('b' , new Tile());
            tile.get('b').image = getImage("/tiles/swampTiles/Tile_06.png");
            tile.get('b').collision = true;

            tile.put('c' , new Tile());
            tile.get('c').image = getImage("/tiles/swampTiles/Tile_31.png");
            tile.get('c').collision = true;

            tile.put('d' , new Tile());
            tile.get('d').image = getImage("/tiles/swampTiles/Tile_32.png");
            tile.get('d').collision = true;

            tile.put('e' , new Tile());
            tile.get('e').image = getImage("/tiles/swampTiles/Tile_33.png");
            tile.get('e').collision = true;

            tile.put('f' , new Tile());
            tile.get('f').image = getImage("/tiles/swampTiles/Tile_34.png");
            tile.get('f').collision = true;
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadMap(String filePath) {
        try{
            InputStream is = getClass().getResourceAsStream(filePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            int col = 0;
            int row = 0;

            while(col < gp.maxWorldCol && row < gp.maxWorldRow) {
                String line = br.readLine();
                while(col < gp.maxWorldCol) {
                    String[] values = line.split(" ");
                    char val = values[col].charAt(0);
                    mapTileVal[col][row] = val;
                    col++;
                }
                if(col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }

            br.close();

        }catch(Exception e) {

        }
    }

    public void draw(Graphics2D g2) {

        int worldCol = 0;
        int worldRow = 0;
        int x = 0;
        int y = 0;

        while(worldCol < gp.maxScreenCol && worldRow < gp.maxScreenRow) {

            char tileVal = mapTileVal[worldCol][worldRow];

            int worldX = worldCol * gp.tileSize;
            int worldY = worldRow * gp.tileSize;
            int screenX = worldX - gp.player.worldX + gp.player.screenX;
            int screenY = y;

            g2.drawImage(tile.get(tileVal).image, screenX, screenY, gp.tileSize,gp.tileSize,null);
            worldCol++;
            x += gp.tileSize;

            if(worldCol == gp.maxScreenCol) {
                worldCol = 0;
                //x = 0;
                worldRow++;
                y += gp.tileSize;
            }

        }
    }
}
