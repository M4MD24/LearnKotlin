package _2_solve._2_2_codeforces._2_2_2_problem_set._2_2_2_22_triangle

fun main() {
    val lineOfTriangleData = readln()
        .split(' ')
        .map { it.toShort() }
    val latitudeCoordinatesFirstPoint = lineOfTriangleData[0]
    val longitudeCoordinatesFirstPoint = lineOfTriangleData[1]
    val latitudeCoordinatesSecondPoint = lineOfTriangleData[2]
    val longitudeCoordinatesSecondPoint = lineOfTriangleData[3]
    val latitudeCoordinatesThirdPoint = lineOfTriangleData[4]
    val longitudeCoordinatesThirdPoint = lineOfTriangleData[5]
    print(
        getTriangleStatus(
            latitudeCoordinatesFirstPoint,
            longitudeCoordinatesFirstPoint,
            latitudeCoordinatesSecondPoint,
            longitudeCoordinatesSecondPoint,
            latitudeCoordinatesThirdPoint,
            longitudeCoordinatesThirdPoint
        )
    )
}

private fun getTriangleStatus(
    latitudeCoordinatesFirstPoint: Short,
    longitudeCoordinatesFirstPoint: Short,
    latitudeCoordinatesSecondPoint: Short,
    longitudeCoordinatesSecondPoint: Short,
    latitudeCoordinatesThirdPoint: Short,
    longitudeCoordinatesThirdPoint: Short
) = if (
    isRightAngledTriangleCondition(
        latitudeCoordinatesFirstPoint,
        longitudeCoordinatesFirstPoint,
        latitudeCoordinatesSecondPoint,
        longitudeCoordinatesSecondPoint,
        latitudeCoordinatesThirdPoint,
        longitudeCoordinatesThirdPoint
    )
)
    "RIGHT"
else if (isAlmostRightAngledTriangleCondition(
        latitudeCoordinatesFirstPoint,
        longitudeCoordinatesFirstPoint,
        latitudeCoordinatesSecondPoint,
        longitudeCoordinatesSecondPoint,
        latitudeCoordinatesThirdPoint,
        longitudeCoordinatesThirdPoint
    )
)
    "ALMOST"
else
    "NEITHER"

private fun isAlmostRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint: Short,
    longitudeCoordinatesFirstPoint: Short,
    latitudeCoordinatesSecondPoint: Short,
    longitudeCoordinatesSecondPoint: Short,
    latitudeCoordinatesThirdPoint: Short,
    longitudeCoordinatesThirdPoint: Short
) = isRightAngledTriangleCondition(
    (latitudeCoordinatesFirstPoint + 1).toShort(),
    longitudeCoordinatesFirstPoint,
    latitudeCoordinatesSecondPoint,
    longitudeCoordinatesSecondPoint,
    latitudeCoordinatesThirdPoint,
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    (latitudeCoordinatesFirstPoint - 1).toShort(),
    longitudeCoordinatesFirstPoint,
    latitudeCoordinatesSecondPoint,
    longitudeCoordinatesSecondPoint,
    latitudeCoordinatesThirdPoint,
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    (longitudeCoordinatesFirstPoint + 1).toShort(),
    latitudeCoordinatesSecondPoint,
    longitudeCoordinatesSecondPoint,
    latitudeCoordinatesThirdPoint,
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    (longitudeCoordinatesFirstPoint - 1).toShort(),
    latitudeCoordinatesSecondPoint,
    longitudeCoordinatesSecondPoint,
    latitudeCoordinatesThirdPoint,
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    longitudeCoordinatesFirstPoint,
    (latitudeCoordinatesSecondPoint + 1).toShort(),
    longitudeCoordinatesSecondPoint,
    latitudeCoordinatesThirdPoint,
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    longitudeCoordinatesFirstPoint,
    (latitudeCoordinatesSecondPoint - 1).toShort(),
    longitudeCoordinatesSecondPoint,
    latitudeCoordinatesThirdPoint,
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    longitudeCoordinatesFirstPoint,
    latitudeCoordinatesSecondPoint,
    (longitudeCoordinatesSecondPoint + 1).toShort(),
    latitudeCoordinatesThirdPoint,
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    longitudeCoordinatesFirstPoint,
    latitudeCoordinatesSecondPoint,
    (longitudeCoordinatesSecondPoint - 1).toShort(),
    latitudeCoordinatesThirdPoint,
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    longitudeCoordinatesFirstPoint,
    latitudeCoordinatesSecondPoint,
    longitudeCoordinatesSecondPoint,
    (latitudeCoordinatesThirdPoint + 1).toShort(),
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    longitudeCoordinatesFirstPoint,
    latitudeCoordinatesSecondPoint,
    longitudeCoordinatesSecondPoint,
    (latitudeCoordinatesThirdPoint - 1).toShort(),
    longitudeCoordinatesThirdPoint
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    longitudeCoordinatesFirstPoint,
    latitudeCoordinatesSecondPoint,
    longitudeCoordinatesSecondPoint,
    latitudeCoordinatesThirdPoint,
    (longitudeCoordinatesThirdPoint + 1).toShort()
) || isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint,
    longitudeCoordinatesFirstPoint,
    latitudeCoordinatesSecondPoint,
    longitudeCoordinatesSecondPoint,
    latitudeCoordinatesThirdPoint,
    (longitudeCoordinatesThirdPoint - 1).toShort()
)

private fun isRightAngledTriangleCondition(
    latitudeCoordinatesFirstPoint: Short,
    longitudeCoordinatesFirstPoint: Short,
    latitudeCoordinatesSecondPoint: Short,
    longitudeCoordinatesSecondPoint: Short,
    latitudeCoordinatesThirdPoint: Short,
    longitudeCoordinatesThirdPoint: Short
): Boolean {
    if (
        (
                latitudeCoordinatesFirstPoint == latitudeCoordinatesSecondPoint &&
                        longitudeCoordinatesFirstPoint == longitudeCoordinatesSecondPoint
                ) || (
                latitudeCoordinatesFirstPoint == latitudeCoordinatesThirdPoint &&
                        longitudeCoordinatesFirstPoint == longitudeCoordinatesThirdPoint
                ) || (
                latitudeCoordinatesSecondPoint == latitudeCoordinatesThirdPoint &&
                        longitudeCoordinatesSecondPoint == longitudeCoordinatesThirdPoint
                )
    ) return false
    val firstEdgeSquared = (((latitudeCoordinatesFirstPoint - latitudeCoordinatesSecondPoint) * (latitudeCoordinatesFirstPoint - latitudeCoordinatesSecondPoint)) + ((longitudeCoordinatesFirstPoint - longitudeCoordinatesSecondPoint) * (longitudeCoordinatesFirstPoint - longitudeCoordinatesSecondPoint))).toShort()
    val secondEdgeSquared = (((latitudeCoordinatesFirstPoint - latitudeCoordinatesThirdPoint) * (latitudeCoordinatesFirstPoint - latitudeCoordinatesThirdPoint)) + ((longitudeCoordinatesFirstPoint - longitudeCoordinatesThirdPoint) * (longitudeCoordinatesFirstPoint - longitudeCoordinatesThirdPoint))).toShort()
    val thirdEdgeSquared = (((latitudeCoordinatesSecondPoint - latitudeCoordinatesThirdPoint) * (latitudeCoordinatesSecondPoint - latitudeCoordinatesThirdPoint)) + ((longitudeCoordinatesSecondPoint - longitudeCoordinatesThirdPoint) * (longitudeCoordinatesSecondPoint - longitudeCoordinatesThirdPoint))).toShort()
    val edgesSquared = shortArrayOf(
        firstEdgeSquared,
        secondEdgeSquared,
        thirdEdgeSquared
    )
    edgesSquared.sort()
    val smallEdgeSquared = (edgesSquared[0] + edgesSquared[1]).toShort()
    val largeEdgeSquared = edgesSquared[2]
    return smallEdgeSquared == largeEdgeSquared
}