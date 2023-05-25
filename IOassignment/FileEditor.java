package IOassignment;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileEditor {
    private static final List<Integer> list1 = new ArrayList<>();
    private static final List<Integer> list2 = new ArrayList<>();
    private static final List<Integer> intList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        reader("input1.txt", list1);
        reader("input2.txt", list2);
        writer("merge.txt",intList);
        compare(list1, list2);
    }

    public static void reader(String name, List<Integer> list) throws IOException {
            Path path = Paths.get("IOassignment", name);
            List<Integer> print = Files.readAllLines(path).stream()
                    .map(Integer::parseInt)
                    .toList();
            list.addAll(print);
            intList.addAll(list);
    }

    public static void writer(String name, List<Integer> list) throws IOException {
            File file = new File("IOassignment", name);
            List<String> print = list.stream()
                    .map(s -> Integer.toString(s))
                    .toList();
            Files.write(file.toPath(), print);
    }

    public static void compare(List<Integer> list1, List<Integer> list2) throws IOException {
            list1 = list1.stream()
                    .filter(list2::contains)
                    .toList();
            writer("common.txt", list1);
    }
}
