//package com.zalando.examples;
//
//import java.io.File;
//
//
//public class DirectoryTreeBuilder {
//
//    public static void main(String[] args) {
//        String rootPath = "src/main/java/com/zalando"; // Change this to the root directory you want to explore
//        File rootDirectory = new File(rootPath);
//
//        if (rootDirectory.exists() && rootDirectory.isDirectory()) {
//            FileNode root = buildDirectoryTree(rootDirectory);
//            printDirectoryTree(root, 0);
//        } else {
//            System.out.println("Invalid directory path.");
//        }
//    }
//
//    private static FileNode buildDirectoryTree(File directory) {
//        File[] files = directory.listFiles();
//        FileNode[] children = new FileNode[files.length];
//
//        for (int i = 0; i < files.length; i++) {
//            File file = files[i];
//            if (file.isDirectory()) {
//                children[i] = buildDirectoryTree(file);
//            } else {
//                children[i] = new FileNode(file.getName(), false, null);
//            }
//        }
//
//        return new FileNode(directory.getName(), true, children);
//    }
//
//    private static void printDirectoryTree(FileNode node, int depth) {
//        StringBuilder indent = new StringBuilder();
//        for (int i = 0; i < depth; i++) {
//            indent.append("  ");
//        }
//
//        System.out.println(indent + (node.isDirectory() ? "[D] " : "[F] ") + node.name());
//
//        if (node.children() != null) {
//            for (FileNode child : node.children()) {
//                printDirectoryTree(child, depth + 1);
//            }
//        }
//    }
//}
