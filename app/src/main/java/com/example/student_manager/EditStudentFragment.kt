package com.example.student_manager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class EditStudentFragment : Fragment() {
    // Sử dụng navArgs() để truy xuất đối tượng args đã được định nghĩa qua Safe Args
    private val args: EditStudentFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_edit_student, container, false)
        val nameField = view.findViewById<EditText>(R.id.etName)
        val idField = view.findViewById<EditText>(R.id.etId)
        val saveButton = view.findViewById<Button>(R.id.btnSave)

        // Hiển thị thông tin sinh viên hiện tại
        nameField.setText(args.studentName)
        idField.setText(args.studentId)

        saveButton.setOnClickListener {
            val updatedName = nameField.text.toString()
            val updatedId = idField.text.toString()
            if (updatedName.isNotBlank() && updatedId.isNotBlank()) {
                Toast.makeText(requireContext(), "Đã lưu thay đổi: $updatedName", Toast.LENGTH_SHORT).show()
                findNavController().navigateUp()
            } else {
                Toast.makeText(requireContext(), "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}
