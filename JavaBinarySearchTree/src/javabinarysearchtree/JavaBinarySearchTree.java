package javabinarysearchtree;

import java.util.Random;

class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class JavaBinarySearchTree {

    public static Node root;

    public JavaBinarySearchTree() {
        JavaBinarySearchTree.root = null;
    }

    public void insert(int id) {
        Node newNode = new Node(id);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (id < current.data) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    public boolean delete(int id) {
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while (current.data != id) {
            parent = current;
            if (current.data > id) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
		//if i am here that means we have found the node
        //Case 1: if node to be deleted has no children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild == true) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        } //Case 2 : if node to be deleted has only one child
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        } else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else if (current.left != null && current.right != null) {

            //now we have found the minimum element in the right sub tree
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
        return true;
    }

    public Node getSuccessor(Node deleleNode) {
        Node successsor = null;
        Node successsorParent = null;
        Node current = deleleNode.right;
        while (current != null) {
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }
		//check if successor has the right child, it cannot have left child for sure
        // if it does have the right child, add it to the left of successorParent.
//		successsorParent
        if (successsor != deleleNode.right) {
            successsorParent.left = successsor.right;
            successsor.right = deleleNode.right;
        }
        return successsor;
    }

    public void display(Node root) {
        if (root != null) {
            System.out.print(" " + root.data);
            display(root.left);
            display(root.right);
        }
    }

    int countChildren(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countChildren(node.left) + countChildren(node.right);
    }

    int sumDepthOfAllChildren(Node node, int depth) {
        if (node == null) {
            return 0;  // starting to see a pattern?
        }
        return depth + sumDepthOfAllChildren(node.left, depth + 1)
                + sumDepthOfAllChildren(node.right, depth + 1);
    }

    public static int randomSayilar() {
        Random rand = new Random();
        int randomNum = rand.nextInt(30);
        return randomNum;
    }

    public boolean isLeaf(Node n) {
        return (n.left == null && n.right == null);

    }

    public void deleteTree() {
        root = null;
    }

    public void deleteTree(Node n) {
        if (n == null) {
            return;
        }
        if (n.left != null && isLeaf(n.left)) {
            n.left = null;
        } else {
            deleteTree(n.left);
        }
        if (n.right != null && isLeaf(n.right)) {
            n.right = null;
        } else {
            deleteTree(n.right);
        }
    }

    public static void main(String arg[]) {
        JavaBinarySearchTree b = new JavaBinarySearchTree();
        int toplamDerinlik;
        int childSayisi;
        int tekrarSayisi = 3;
        int dugumSayisi = b.randomSayilar();
        for (int j = 0; j < tekrarSayisi; j++) {
            dugumSayisi = b.randomSayilar();
            for (int i = 0; i < dugumSayisi; i++) {
                b.insert(randomSayilar());
            }
            childSayisi = b.countChildren(root);
            toplamDerinlik = b.sumDepthOfAllChildren(root, 0);
            System.out.println("Toplam cocuk sayisi : " + childSayisi);
            System.out.println("Ortalama Derinlik : " + toplamDerinlik/childSayisi);
            System.out.println("Log(dugumSayisi) : " + Math.log(childSayisi));
            System.out.println("Derinlik / Log(dugumSayisi) : " + (Math.log(childSayisi)/toplamDerinlik));
            System.out.println("");
            for (int i = 0; i < dugumSayisi; i++) {
                b.deleteTree(root);
            }
        }

        //System.out.println("Ortalama Derinlik : " + (toplamDerinlik / childSayisi));
        System.out.println("\nTree : ");
        b.display(root);

    }
}
