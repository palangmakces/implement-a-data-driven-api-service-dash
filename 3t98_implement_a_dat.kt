data class ServiceDashboard(
    val id: Int,
    val serviceName: String,
    val serviceDescription: String,
    val serviceStatus: ServiceStatus,
    val metrics: List<Metric>,
    val widgets: List<Widget>
)

data class Metric(
    val id: Int,
    val name: String,
    val value: Double,
    val unit: String
)

data class Widget(
    val id: Int,
    val name: String,
    val type: WidgetType,
    val config: String
)

enum class ServiceStatus {
    UP,
    DOWN,
    DEGRADED
}

enum class WidgetType {
    CHART,
    TABLE,
    TEXT
}