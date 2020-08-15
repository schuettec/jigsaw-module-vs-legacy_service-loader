module service.runner {
	exports com.github.schuettec.serviceloader.runner;

	requires service.api;

	uses com.github.schuettec.serviceloader.api.IncrementService;
}