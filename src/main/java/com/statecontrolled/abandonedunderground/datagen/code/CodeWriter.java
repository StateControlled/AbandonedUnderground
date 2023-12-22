package com.statecontrolled.abandonedunderground.datagen.code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This will generate the code for any new block name added to the names.txt file in the same directory.
 * Resulting code may need to be adjusted manually if the added blocks are more than just simple blocks
 **/
public class CodeWriter {
    private static final String REGISTER_BLOCK_CODE = "public static final RegistryObject<Block> %s = registerBlock(\"%s\", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops()));";
    private static final String BLOCK_STATE_CODE = "auSimpleCubicBlock(AUBlocks.%s);";
    private static final String BLOCK_TAG_GET_CODE = "AUBlocks.%s.get(),";
    private static final String CREATIVE_TAB_CODE = "output.accept(AUBlocks.%s.get());";
    private static final String BLOCK_LOOT_TABLE_CODE = "this.dropSelf(AUBlocks.%s.get());";
    private static final String TRANSLATION_CODE = "\"block.abandonedunderground.%s\": \"%s\",";

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/main/java/com/statecontrolled/abandonedunderground/datagen/code/names.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("code_output.txt");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            List<String> fileContents = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                fileContents.add(line);
            }

            reader.close();
            fileReader.close();

            // Write block registry
            for (String s : fileContents) {
                String lower = s.toLowerCase().replaceAll(" ", "_"); // word_word_word
                String upper = s.toUpperCase().replaceAll(" ", "_"); // WORD_WORD_WORD

                writer.write(String.format(REGISTER_BLOCK_CODE, upper, lower));
                writer.newLine();
            }
            writer.newLine();

            // Write block state
            for (String s : fileContents) {
                String upper = s.toUpperCase().replaceAll(" ", "_");

                writer.write(String.format(BLOCK_STATE_CODE, upper));
                writer.newLine();
            }
            writer.newLine();

            // Write block tags
            for (String s : fileContents) {
                String upper = s.toUpperCase().replaceAll(" ", "_");

                writer.write(String.format(BLOCK_TAG_GET_CODE, upper));
                writer.newLine();
            }
            writer.newLine();

            // Write creative mode entry
            for (String s : fileContents) {
                String upper = s.toUpperCase().replaceAll(" ", "_");

                writer.write(String.format(CREATIVE_TAB_CODE, upper));
                writer.newLine();
            }
            writer.newLine();

            // Write block loot table
            for (String s : fileContents) {
                String upper = s.toUpperCase().replaceAll(" ", "_");

                writer.write(String.format(BLOCK_LOOT_TABLE_CODE, upper));
                writer.newLine();
            }
            writer.newLine();

            // Write translation
            for (String s : fileContents) {
                String lower = s.toLowerCase().replaceAll(" ", "_");
                String titleCase = Arrays.stream(s.split(" "))
                    .map(word -> word.isEmpty()
                        ? word
                        : Character.toTitleCase(word.charAt(0)) + word
                        .substring(1)
                        .toLowerCase())
                    .collect(Collectors.joining(" "));

                writer.write(String.format(TRANSLATION_CODE, lower, titleCase));
                writer.newLine();
            }

            writer.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
