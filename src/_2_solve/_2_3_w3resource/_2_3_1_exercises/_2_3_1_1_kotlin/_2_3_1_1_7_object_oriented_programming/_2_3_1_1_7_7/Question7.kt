package _2_solve._2_3_w3resource._2_3_1_exercises._2_3_1_1_kotlin._2_3_1_1_7_object_oriented_programming._2_3_1_1_7_7

/**
 * Write a Kotlin object-oriented program that implements the composite pattern by creating a base class Component and composite classes CompositeComponent and BranchComponent to represent a hierarchical structure.
 * */

fun main() {
    val documents = arrayOf<Component>(
        BranchComponent("Document1.txt"),
        BranchComponent("Document2.txt"),
        BranchComponent("Document3.txt")
    )
    val images = arrayOf<Component>(
        BranchComponent("Image1.mp3"),
        BranchComponent("Image2.mp3"),
        BranchComponent("Image3.mp3")
    )
    val videos = arrayOf<Component>(
        BranchComponent("Video1.mp4"),
        BranchComponent("Video2.mp4"),
        BranchComponent("Video3.mp4")
    )
    val folderOfDocuments = CompositeComponent("My Documents")
    folderOfDocuments.addComponent(*documents)
    val folderOfImages = CompositeComponent("My Images")
    folderOfImages.addComponent(*images)
    val folderOfVideos = CompositeComponent("My Videos")
    folderOfVideos.addComponent(*videos)
    val mainFolder = CompositeComponent("Main Folder")
    mainFolder.addComponent(
        folderOfDocuments,
        folderOfImages,
        folderOfVideos
    )
    mainFolder.showDetails()
}