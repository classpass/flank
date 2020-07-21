package ftl.environment

import com.google.api.services.testing.model.ProvidedSoftwareCatalog
import ftl.util.TableColumn
import ftl.util.buildTable

fun ProvidedSoftwareCatalog.asTable() = buildTable(
    TableColumn(
        ORCHESTRATOR_VERSION,
        listOf(orchestratorVersion)
    )
)

private const val ORCHESTRATOR_VERSION = "ORCHESTRATOR VERSION"
