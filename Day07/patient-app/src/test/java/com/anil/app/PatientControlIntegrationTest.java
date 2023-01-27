package com.anil.app;

public class PatientControlIntegrationTest {

    @InjectMocks
    PatientController patientController;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    PatientService patientService;

    @Value("${patient.post.url}")
    String posturl;
}
